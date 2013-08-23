package scala.compiler.plugins.$plugin_name;format="camel"$

import scala.tools.nsc
import nsc.Global
import nsc.Phase
import nsc.plugins.Plugin
import nsc.plugins.PluginComponent
import nsc.transform.{ Transform, TypingTransformers }
import nsc.symtab.Flags._
import nsc.symtab.Flags


class $plugin_name;format="Camel"$CompilerPlugin (val global: Global) extends Plugin {
  import global._

  val name = "$plugin_name$"
  val description = "$plugin_description$"
  val components = List[PluginComponent](MyComponent)

  private object MyComponent extends PluginComponent with Transform {

    import global._
    import global.definitions._

    val global = $plugin_name;format="Camel"$CompilerPlugin.this.global
    override val runsAfter = List[String]("parser") // parser,namer,typer,patmat
    val phaseName = $plugin_name;format="Camel"$CompilerPlugin.this.name

    // Define a transformation
    def newTransformer(unit: CompilationUnit) = new MyTransformer(unit)
    class MyTransformer (unit: CompilationUnit) extends Transformer {
      override def transform (tree: Tree): Tree = super.transform { tree match {

        //[...]

      }} // END OF TRANSFORM
    } // END OF CLASS TRANSFORMER

  } // END OF CLASS PLUGIN COMPONENT
} // END OF CLASS COMPILER PLUGIN
