
    chrome.webRequest.onAuthRequired.addListener(function(details){
        console.log("chrome.webRequest.onAuthRequired event has fired");
        return {
                authCredentials: {username: "brmdev", password: "lMW5&*2hLw2S"}
            };
    },
    {urls:["<all_urls>"]},
    ['blocking']);



