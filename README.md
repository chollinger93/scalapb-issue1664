https://github.com/scalapb/ScalaPB/issues/1664

## Run
```bash
# Clone https://github.com/chollinger93/ScalaPB/tree/chollinger93/1664-private-typemapper
sbt publishLocal
```

```bash
nix-shell
sbt run
```

Root cause: `-Yretain-trees` compiler option
