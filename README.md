# Cassandra Helpers

## What is it?

A set of utility code on top of the Apache and Datastax drivers for
working with Cassandra databases. There are a few interesting
facilities provided here:

- [*Multiring management*](multiring-management.md): Easily connect to
multiple Cassandra rings and migrate data from one ring to another.

- [*AutoSchema*](autoschema.md): Compares the schema in a Cassandra Ring
against your annotation-based schema definition, and performs
alterations to bring your ring's schema up-to-date. This is done in a
non-destructive manner by default.

- [*Annotation-Based Schema Definition*](annotation-schema.md): define
your tables' schemas using a documented, declarative mini-language,
and allow AutoSchema to manage your ring's schema.

- [*Temporary Keyspaces and Tables*](raii.md) - build Cassandra keyspaces
and tables, and use Java's
[try-with-resources Statement](https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html)
to guarantee that your temporary keyspaces and tables get deleted at a
predictable time.

- [*Walkers*](walkers.md) - Treat Cassandra tables as if they were
  iterable collections, complete with for-each syntax support.

- [*Transformers*](transformers.md) - Managed data transformation; think
  Spark, but without having to actually install, integrate, or manage
  spark. (Okay, it's nowhere near as cool as Spark, but it has some
  interesting uses.)
