package com.amit.learning.executor;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.yaml.snakeyaml.Yaml;

import com.amit.learning.Configuration;

public class YamlConfigRunner {
	public static void main(final String[] args) throws IOException {
		if( args.length != 1 ) {
			System.out.println( "Usage: <file.yml>" );
			return;
		}

		Yaml yaml = new Yaml();
		try( InputStream in = Files.newInputStream( Paths.get( args[ 0 ] ) ) ) {
			Configuration config = yaml.loadAs( in, Configuration.class );
			System.out.println( config.toString() );
		}
	}
}
