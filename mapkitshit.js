//import apple mapkit.js and print the current coordinates of this device to the terminal

var mapkit = require('apple-mapkit-js');
var geolocation = require('geolocation');

//use apple-mapkit-js to open up a with the current location of this device on a map
mapkit.init({
    authorizationCallback: function(done) {
        done(mapkit.AuthorizationStatus.Authorized);
    }
});

var map = new mapkit.Map("map");
map.showItems([new mapkit.CoordinateRegion(new mapkit.Coordinate(), new mapkit.CoordinateSpan(0.1, 0.1))]);

//use geolocation to print the current coordinates of this device to a browser
geolocation.getCurrentPosition(function(location) {
    document.getElementById('location').innerHTML = 'Latitude: ' + location.coords.latitude + ' Longitude: ' + location.coords.longitude;
    }
);
