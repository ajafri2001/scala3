package dotty.tools.dotc.core

import dotty.tools.tasty.TastyFormat

/** The possible tags of a NameKind */
object NameTags extends TastyFormat.NameTags {

  final val FLATTENED = 5       // A flat name, generated by Flatten

  final val TRAITSETTER = 6     // A Scala-2 trait setter, generated by AugmentScala2Traits

  final val OUTERSELECT = 13    // A name `<num>_outer`, used by the inliner to indicate an
                                // outer accessor that will be filled in by ExplicitOuter.
                                // <num> indicates the number of hops needed to select the outer field.

  final val PROTECTEDACCESSOR = 24 // The name of a protected accesor `protected$<name>` created by ProtectedAccessors.

  final val INITIALIZER = 26    // A mixin initializer method

  final val AVOIDCLASH = 27     // Adds a suffix to avoid a name clash;
                                // Used in FirstTransform for synthesized companion objects of classes
                                // if they would clash with another value.

  final val DIRECT = 28         // Used by ShortCutImplicits for the name of methods that
                                // implement implicit function result types directly.

  final val FIELD = 29          // Used by Memoize to tag the name of a class member field.

  final val EXTMETH = 30        // Used by ExtensionMethods for the name of an extension method
                                // implementing a value class method.

  final val ADAPTEDCLOSURE = 31 // Used in Erasure to adapt closures over primitive types.

  final val IMPLMETH = 32       // Used to define methods in implementation classes
                                // (can probably be removed).

  final val CACHE = 33          // Used as a cache for the rhs of an alias implicit.

  def nameTagToString(tag: Int): String = tag match {
    case UTF8 => "UTF8"
    case QUALIFIED => "QUALIFIED"
    case FLATTENED => "FLATTENED"
    case EXPANDED => "EXPANDED"
    case EXPANDPREFIX => "EXPANDPREFIX"
    case TRAITSETTER => "TRAITSETTER"
    case UNIQUE => "UNIQUE"
    case DEFAULTGETTER => "DEFAULTGETTER"
    case VARIANT => "VARIANT"
    case OUTERSELECT => "OUTERSELECT"

    case SUPERACCESSOR => "SUPERACCESSOR"
    case INLINEACCESSOR => "INLINEACCESSOR"
    case PROTECTEDACCESSOR => "PROTECTEDACCESSOR"
    case INITIALIZER => "INITIALIZER"
    case AVOIDCLASH => "AVOIDCLASH"
    case DIRECT => "DIRECT"
    case FIELD => "FIELD"
    case EXTMETH => "EXTMETH"
    case ADAPTEDCLOSURE => "ADAPTEDCLOSURE"
    case OBJECTCLASS => "OBJECTCLASS"

    case SIGNED => "SIGNED"
  }
}
