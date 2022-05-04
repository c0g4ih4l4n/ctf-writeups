Java.perform(function() {
    console.log("[.] get flag");

    var main_activity = Java.use('com.example.clickme.MainActivity');

    main_activity.getFlagButtonClick.implementation = function(view){
        const main = Java.use('com.example.clickme.MainActivity');
        var flag = main.$new().getFlag();

        console.log(flag);
    };
});