import http from '../util/http.js';

const API={
    getUsers:()=>{
        return http({url:'http://localhost:8080/sysuser/list',method:'get'});
    },
    get:(url,params)=>{return http({url:url,method:'get',params:params})},
    del:(url,id)=>{
        url=url+'/'+id;//url    /api/satff
        return http({url:url,method:'delete'})}
    ,postForm:function(url,params){console.log(params);return http({url:url,method:'post',params:params})},
    postJson:function(url,data){return http({url:url,method:'post',data:data})},
    putForm:function(url,params){return http({url:url,method:'put',params:params})},
    putJson:function(url,data){return http({url:url,method:'put',data:data})}
};
export default API;