# May need to run:
# xhost +
# BEFORE opening JavaFX code.
FROM openjdk:8-slim
RUN apt-get update && apt-get install -y --no-install-recommends \
    libgl1-mesa-dri \
    openjfx \
  && rm -rf /var/lib/apt/lists/*
