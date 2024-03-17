package test.implicits

import scalapb.{TypeMapper, GeneratedEnumCompanion}


given tm[E <: scalapb.GeneratedEnum](using ec: GeneratedEnumCompanion[E]): TypeMapper[E, String] =
    TypeMapper[E, String](_.name)(ec.fromName(_).get)
