FROM alpine

ENV BUILD_DEPS \
  build-base \
  git \
  go

ENV RUN_DEPS \
  bash \
  ca-certificates

ENV PATH=/root/bin:$PATH

RUN apk add --no-cache \
    $BUILD_DEPS \
    $RUN_DEPS \
  && go get github.com/mstruebing/tldr \
  && git clone https://github.com/mstruebing/tldr.git tldr \
  && cd tldr \
  && sed -i 's/sudo\ //g' Makefile \
  && make install \
  && cd .. \
  && rm -rf tldr \
  && apk del $BUILD_DEPS

VOLUME /root/go
