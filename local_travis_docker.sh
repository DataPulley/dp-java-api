#!/bin/bash

sudo docker build -t ci .
sudo docker run -ti -e JOB=CI ci ./local_travis.sh
