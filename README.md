
# lein-vimclojure

A leiningen plugin to launch a vimclojure nailgun server.
This is a fork of the work started by [brandow](http://github.com/brandonw).  
You can find the original version at [lein-nailgun](http://github.com/brandonw/lein-nailgun).

## Works with the latest vimclojure

This release is compatible with clojure 1.2 and vimclojure 2.2.0.

## Installation

Make sure `:dev-dependencies` in your project.clj contains the following:

	[org.clojars.autre/lein-vimclojure "1.0.0"]


## Running

	$ lein deps
	$ lein vimclojure &

Then from vi with an open clojure file you can `\sr`, `\et`, etc.

