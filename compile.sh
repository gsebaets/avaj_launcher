#!/usr/bin/env bash
find . -name "*.java" > sources.txt
javac -sourcepath . @sources.txt
cd src
java Sim_Pack/Main ../scenario.txt