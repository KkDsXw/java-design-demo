package com.kk.test.jdk.custom;

import com.sun.xml.internal.fastinfoset.tools.TransformInputOutput;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 自定义类加载器
 *
 * @Author kk.xie
 * @Date 2019/11/14 11:42
 * @Version 1.0
 **/
public class KkClassLoader extends ClassLoader{

    private File classPathFile;

    public KkClassLoader() {
        String classPath = KkClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        if(classPathFile != null){
            File classFile = new File(classPathFile, name.replaceAll("\\.", "/") + ".class");
            if(classFile.exists()){
                FileInputStream in = null;
                ByteArrayOutputStream out = null;

                try {
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();


                    byte [] buff = new byte[1024];
                    int len;
                    while((len = in.read(buff)) != -1){
                        out.write(buff, 0, len);
                    }

                    String className = KkClassLoader.class.getPackage().getName() + "." + name;
                    return defineClass(className, out.toByteArray(), 0 , out.size());
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    try {
                        if(in != null){
                            in.close();
                        }
                        if(out != null){
                            out.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return null;
    }
}
