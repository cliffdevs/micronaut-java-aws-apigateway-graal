#!/bin/sh
docker build . -t my-app
mkdir -p build
docker run --rm --entrypoint cat my-app  /home/application/function.zip > build/function.zip
