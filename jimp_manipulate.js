// Import dependencies
const Jimp = require("jimp");

async function nameoffunction1 () {

    // Read the image
    const image = await Jimp.read("img.jpg"); // http://www.example.com/path/to/lenna.jpg

    // Add text
     const font = await Jimp.loadFont(Jimp.FONT_SANS_16_WHITE); // bitmap fonts
     image.print(font, 0, 0, 'Hello world!'); // https://github.com/libgdx/libgdx/wiki/Hiero

     // Resize the height to 250 and scale the width accordingly
     image.resize(Jimp.AUTO, 1920);

     // Resize the width to 250 and scale the height accordingly
     image.resize(1080, Jimp.AUTO);

     // Add a sepia wash to the im  age
     image.sepia();

     // Pixelation 
     //image.pixelate(5);
     //image.pixelate(5, 50, 50, 190, 200);

     // Clone
     const image2 = image.clone();

     // Blur the image
     //image.gaussian(1);
     //image.blur(1);

     // Inverts the image
     //image.invert(); 

     // Set the brightness
     //image.brightness( 0.5 ); // -1 to +1

     // Resize the image
     image.resize(1920, 1080);

     // Set the quality
     image.quality(100);

     // Convert to grayscale
     //image.greyscale();

    // Save the image
    image.write("img_edted.jpg"); // writeAsync

};

nameoffunction1();