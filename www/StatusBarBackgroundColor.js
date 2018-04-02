var exec = require('cordova/exec');

var StatusBarBackgroundColor = {
    enable: function (pharse, success, fail) {
        exec(success ? success : null, fail ? fail : null, 'StatusBarBackgroundColor', 'enable', []);
    }
};

module.exports = StatusBarBackgroundColor;