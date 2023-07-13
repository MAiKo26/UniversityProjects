$(document).ready(fApp);

function fApp() {
    //var url = "http://www.ilc.tn/API/METEO/";
    var url = "./js/meteo.json";
    $.getJSON(url, fMETEO);
}

function fMETEO(x) {
    for (var i = 0; i < x.length; i++) {
        var c = '<div class="col-12">' +
            '<div class="card bg-light">' +
            ' <div class="card-body">' +
            ' <div class="row">' +
            '<div class="col-4 bg-success">' +
            '<h1 class="card-title text-white">' + x[i].temperature + '°</h1>' +
            ' </div>' +
            '<div class="col-8">' +
            '<h3 class="text-muted" style="text-transform: capitalize;">' + x[i].ville + '</h3>' +
            ' </div>' +
            ' </div>' +


            ' </div>' +
            ' </div><br>' +
            ' </div>';

        document.getElementById("meteo").innerHTML += c;


    }


}