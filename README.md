https://github.com/scalapb/ScalaPB/issues/1664

## Run
```bash
nix-shell
sbt run
```

Root cause: `-Yretain-trees` compiler option

## "Fix"

```bash
nix-shell
sbt 'set scalacOptions ~= (_.filterNot(Set("-Yretain-trees")))' run
```

Issue: No `avro4s` defaults set.
