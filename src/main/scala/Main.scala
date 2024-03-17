package myexample

import test.nested.NestedExampleEvent
import test.nested.NestedExampleEvent.given 
import com.sksamuel.avro4s.Encoder as AvroEncoder
import com.sksamuel.avro4s.AvroSchema

trait Thing[A <: scalapb.GeneratedMessage: AvroEncoder]

case object ExampleThing extends Thing[NestedExampleEvent]:
  val enc = AvroEncoder[NestedExampleEvent]
  val schema = AvroSchema[NestedExampleEvent]

@main def hello() = {
    println("Hello")
}
