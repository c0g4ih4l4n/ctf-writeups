## School Unblocker
> Clam was just trying to browse kevinhiggs.com when his school wifi suddenly blocked it! So, he wrote a proxy service so he can view his favorite website again! Can you get the flag hidden behind it?

This is SSRF Challenge. After reviwe source code, I see 2 ideas can be exploit:
1. Mismatch `host` and `hostname` when app compare (After fuzzing parser I don't see any miss parse problem here)
2. HTTP Client configuration (Allow redirect) -> work

I created server: return 308 and Location to flag
