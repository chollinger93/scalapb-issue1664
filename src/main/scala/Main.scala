package myexample

import test.nested.NestedExampleEvent
import test.nested.NestedExampleEvent.given
import com.sksamuel.avro4s.Encoder as AvroEncoder
import com.sksamuel.avro4s.AvroSchema
import org.apache.avro.Schema

trait Thing[A <: scalapb.GeneratedMessage : AvroEncoder]

case object ExampleThing extends Thing[NestedExampleEvent]:
  val enc: AvroEncoder[NestedExampleEvent] = AvroEncoder[NestedExampleEvent]
  val schema: Schema = AvroSchema[NestedExampleEvent]

@main def hello() = {
  println(f"Hello, ${ExampleThing.schema}")
  assert(ExampleThing.schema.toString(false)
    .equals("{\"type\":\"record\",\"name\":\"NestedExampleEvent\",\"namespace\":\"test.nested\",\"fields\":[{\"name\":\"id\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"action\",\"type\":\"string\",\"default\":\"Undefined\"}]}"))

}
