## NoFlags
> After hearing about all of the cheating scandals, clam decided to conduct a sting operation for ångstromCTF. He made a database of fake flags to see who submits them. Unbeknownst to him, a spy managed to sneak a real flag into his database. Can you find it?

This is easy challenge: We exploit sqli (stack queries) to write file on web server and trigger it to get RCE. (php file)
Flag: `actf{why_do_people_still_use_php}`