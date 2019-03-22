--

[Home](README)

# AutoSchema

Compares the schema in a Cassandra Ring against your annotation-based
schema definition, and performs alterations to bring your ring's schema
up-to-date. This is done in a non-destructive manner by default.

This portion is really designed to be used with AutoSchemaCommand from
the (cassandra-dropwizard) library.
