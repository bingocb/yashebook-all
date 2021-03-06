package test;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class ShopMain {
	private static final Logger logger = Logger.getLogger(ShopMain.class);

	public static void main(String[] args) {
		ShopMain generator = new ShopMain();
		generator.process("shop.xml");
	}

	public void process(String fileName) {
		try {
			List<String> warnings = new ArrayList<String>();
			ConfigurationParser cp = new ConfigurationParser(warnings);
			InputStream is = this.getClass().getClassLoader().getResourceAsStream(fileName);
			Configuration config = cp.parseConfiguration(is);
			DefaultShellCallback shellCallback = new DefaultShellCallback(true);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);
			Set<String> ids = new HashSet<String>();
			ids.add("shop");
			myBatisGenerator.generate(null,ids);
		} catch (Exception e) {
			logger.error("Exception:", e);
			e.printStackTrace();
		}
	}

}
