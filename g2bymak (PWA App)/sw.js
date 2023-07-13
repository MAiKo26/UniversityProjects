var CACHE_NAME = "G2ByMAK-v1";
var urlsToCache = [
  "/",
  "/css/style.css",
  "/css/bootstrap.min.css",
  "/js/app.js",
  "/js/bootstrap.min.js",
  "/js/font.js",
  "/js/jquery.min.js",
  "/js/popper.min.js",
  "/js/appmeteo.js",

  "/index.html",
  "/officiel.html",
  "/time.html",
  "/meteo.html",
  "/404.html",
];
self.addEventListener("install", function (event) {
  // Perform install steps
  event.waitUntil(
    caches.open(CACHE_NAME).then(function (cache) {
      console.log("Opened cache");
      return cache.addAll(urlsToCache);
    })
  );
});

self.addEventListener("fetch", function (event) {
  event.respondWith(
    caches.match(event.request).then(function (response) {
      if (response) {
        return response;
      }
      return fetch(event.request).then(function (response) {
        if (!response || response.status !== 200 || response.type !== "basic") {
          return response;
        }
        var responseToCache = response.clone();
        caches.open(CACHE_NAME).then(function (cache) {
          cache.put(event.request, responseToCache);
        });
        return response;
      });
    })
  );
});
