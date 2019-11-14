package com.kk.test.jdk.custom;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 自定义代理类
 *
 * @Author kk.xie
 * @Date 2019/11/14 11:40
 * @Version 1.0
 **/
public class KkProxy {

    private static String ln = "\r\n";

    public static Object newProxyInstance(KkClassLoader loader, Class<?>[] interfaces, KkInvocationHandler h){
        try {
            // 1.动态生成源代码.java文件
            String src = generateSrc(interfaces);

            // 2.Java文件输出磁盘
            String path = KkProxy.class.getResource("").getPath();
            System.out.println(path);
            File file = new File(path + "$Proxy0.java");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(src);
            fileWriter.flush();
            fileWriter.close();

            // 3.把生成的java文件编译生成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> iterable = fileManager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null, null, null, iterable);
            Boolean result = task.call();
            System.out.println("编译: " + result);

            // 4.将编辑生成的.class文件加载到jvm中
            Class<?> proxyClass = loader.findClass("$Proxy0");

            // 5.返回字节码重组以后的新代理对象
            Constructor<?> proxyClassConstructor = proxyClass.getConstructor(KkInvocationHandler.class);
            Object o = proxyClassConstructor.newInstance(h);
            return o;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 生成源代码
     *
     * @param interfaces
     * @return java.lang.String
     * @throws
     * @author kk.xie
     * @date 2019/11/14 15:11
     */
    private static String generateSrc(Class<?>[] interfaces){
        StringBuilder sb = new StringBuilder();
        sb.append("package com.kk.test.jdk.custom;").append(ln);
        sb.append("import com.kk.test.jdk.Person;").append(ln);
        sb.append("import java.lang.reflect.Method;").append(ln);
        sb.append("public class $Proxy0 implements ").append(interfaces[0].getName()).append("{").append(ln);
            sb.append("KkInvocationHandler h;").append(ln);
            sb.append("public $Proxy0(KkInvocationHandler h) {").append(ln);
                sb.append("this.h = h;").append(ln);
             sb.append("}").append(ln);
            for (Method method : interfaces[0].getMethods()) {
                sb.append("public ").append(method.getReturnType().getName()).append(" ").append(method.getName()).append("() {").append(ln);;
                    sb.append("try{").append(ln);
                        sb.append("Method m = ").append(interfaces[0].getName()).append(".class.getMethod(\"" + method.getName() + "\");").append(ln);;
                        sb.append("this.h.invoke(this, m, null);").append(ln);
                    sb.append("}catch(Throwable e){").append(ln);
                        sb.append("e.printStackTrace();").append(ln);
                    sb.append("}").append(ln);
                sb.append("}").append(ln);
            }
        sb.append("}");
        return sb.toString();
    }
}
