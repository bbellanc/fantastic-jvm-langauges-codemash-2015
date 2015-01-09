#! /usr/bin/env bash

jruby osx/references.rb
lein exec osx/references.clj
scala osx/references.scala
groovy osx/references.groovy
setjdk 1.8
jjs osx/references.js
setjdk 1.7