#!/usr/bin/env bash
find . -name "*.java" > sources.txt
javac -sourcepath . @sources.txt
java Sim_Package/Main scenario.txt