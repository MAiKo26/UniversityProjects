var CACHE_NAME = 'MAK-v1';
var urlsToCache = [
    '/',
    '/css/bootstrap.min.css',
    '/js/app.js',
    '/js/appmeteo.js',
    '/js/appdevise.js',
    '/js/bootstrap.min.js',
    '/js/font.js',
    '/js/jquery.min.js',
    '/js/popper.min.js',

    '/index.html',
    '/Esports.html',
    '/OnePiece.html',
    '/GoatGallery.html',
    '/Series.html'
];
self.addEventListener('install', function(event) {
    // Perform install steps
    event.waitUntil(
        caches.open(CACHE_NAME)
        .then(function(cache) {
            console.log('Opened cache');
            return cache.addAll(urlsToCache);
        })
    );
});


self.addEventListener('fetch', function(event) {
    event.respondWith(
        caches.match(event.request)
        .then(function(response) {
            if (response) {
                return response;
            }
            return fetch(event.request).then(
                function(response) {
                    if (!response || response.status !== 200 || response.type !== 'basic') {
                        return response;
                    }
                    var responseToCache = response.clone();
                    caches.open(CACHE_NAME)
                        .then(function(cache) {
                            cache.put(event.request, responseToCache);
                        });
                    return response;
                }
            );
        })
    );
});