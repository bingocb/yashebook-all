package org.mybatis.generator;

import org.apache.log4j.Logger;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ImwalletMain {
    private static final Logger logger = Logger.getLogger(ImwalletMain.class);

    public static void main(String[] args) {
        ImwalletMain generator = new ImwalletMain();
        generator.process("maps/imwallet.xml");
    }

    public void process(String fileName) {
        try {
            List<String> warnings = new ArrayList<String>();
            ConfigurationParser cp = new ConfigurationParser(warnings);
            InputStream is = ImwalletMain.class.getClassLoader().getResourceAsStream(fileName);
            URL u = ImwalletMain.class.getClassLoader().getResource(fileName);
            System.out.println(u);
            Configuration config = cp.parseConfiguration(is);
            DefaultShellCallback shellCallback = new DefaultShellCallback(true);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);
            Set<String> ids = new HashSet<String>();
            ids.add("yashebook");
            myBatisGenerator.generate(null, ids);
        } catch (Exception e) {
            logger.error("Exception:", e);
            e.printStackTrace();
        }
    }

}
