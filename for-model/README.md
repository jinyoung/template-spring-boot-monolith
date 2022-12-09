forEach: Model
fileName: README.md
path: for-model
---
# {{name}}

<function>

window.$HandleBars.registerHelper('path', function () {
    return this.options.packagePath;
});

window.$HandleBars.registerHelper('ifEquals', function (arg1, arg2, options) {
    return (arg1 == arg2) ? options.fn(this) : options.inverse(this);
});

window.$HandleBars.registerHelper('ifContains', function (jsonPath, value, options) {
    
    var evaluatedVal = window.jp.query(this, jsonPath);
    if( evaluatedVal == value || evaluatedVal.includes(value)
        //(Array.isArray(evaluatedVal) && evaluatedVal.includes(value))
        //|| (typeof evaluatedVal === 'string' && evaluatedVal.con)    -->
    ){
        return options.fn(this)
    }else{
        return options.inverse(this)
    }

});

window.$HandleBars.registerHelper('jp', function (jsonPath) {
    var evaluatedVal = window.jp.query(this, jsonPath);
    
    if(Array.isArray(evaluatedVal)) return evaluatedVal.join(", ");
    return evaluatedVal;
});


</function>