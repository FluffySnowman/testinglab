
const { spawn } = require("child_process");

function netmap() {
    const netmap = spawn("ping", ["google.com"]);
    netmap.stdout.on("data", data => {
        console.log(`stdout: ${data}`);
    });
    
    netmap.stderr.on("data", data => {
        console.log(`stderr: ${data}`);
    });
    
    netmap.on("close", code => {
        console.log(`child process exited with code ${code}`);
    });
} 
netmap();