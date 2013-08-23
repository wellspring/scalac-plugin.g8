all:
	@echo Compiling...
	@fsc -d build src/$plugin_name$.scala
	@cd build && jar cf ../$plugin_name;format="camel"$-compiler-plugin.jar . && cd ..

run:
	@echo Compiling a demo with the plugin...
	@scalac -Xplugin:$plugin_name;format="camel"$-compiler-plugin.jar demo/sample.scala
	@echo Running the demo...
	@scala Demo

clean:
	@echo Cleaning...
	@rm -rf build/scala $plugin_name;format="camel"$-compiler-plugin.jar
