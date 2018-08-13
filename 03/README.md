# Running Binaries

```
docker run --rm --volume=$PWD:/srv/node -ti talk-demo-node npm install
```

```
docker run --rm --volume=$PWD:/srv/php -p 8000:8000 -ti talk-demo-php php -S 0.0.0.0:8000
```
