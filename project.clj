(defproject jelly "1.0.0-SNAPSHOT"
  :description "A configurable status board for large-screen monitors/kiosks"
  :url "http://github.com/sgrove/Jelly"
  :repositories [["java.net" "http://download.java.net/maven/2/"]]
  :dependencies [[org.clojure/clojure "1.1.0"]
                 [org.clojure/clojure-contrib "1.1.0"]
                 ;[net.philh.clogge] FIXME: What is this?
                 ; FIXME: This fail on gluegen
                 [net.java.jogl/jogl "1.1.1-rc6"]] 
  :main jelly.core)

