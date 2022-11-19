//TO USE THIS PROGRAM SIMPLE PUT IN YOUR API KEY IN LINE 4 AND RUN IT IN THE TERMINAL WITH node google_revimgsrch.js | THE IMAGE TO REVERSE SEARCH MUST  BE A LINK THAT WILL REPLACE THE LINK ON LINE 8

const SerpApi = require('google-search-results-nodejs');
const search = new SerpApi.GoogleSearch("YOUR_API_KEY");

const params = {
  engine: "google_reverse_image",
  image_url: "https://www.planetware.com/photos-large/F/eiffel-tower.jpg"
};

const callback = function(data) {
  console.log(data["inline_images"]);
};

search.json(params, callback);