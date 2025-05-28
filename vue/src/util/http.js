import axios from 'axios';
import router from '../router';

export default function (options) {
    //配置每次发送请求都从sessionStorage中获取名字叫token的数据,
    //添加到请求头部的Authorization属性中
    //Object.assign用于合并对象的数据
    options.headers = Object.assign(
        {Authorization: sessionStorage.getItem('Authorization')},
        options.headers || {}
    );
    //axios()   返回一个promise对象，用于异步请求
    //options是一个对象，其中包含了许多用于配置请求的参数，
    //例如请求的url、请求方法（GET、POST等）、请求头等
    return axios(options)
        .then(({status, data, statusText}) => {
            //该函数在请求成功并返回数据时被调用
            //status：HTTP状态码，例如200表示请求成功。
            //data：服务器返回的数据。
            // statusText：HTTP状态文本，例如"OK"表示请求成功。
            if (status == 200) {
                return data;
            } else {
                console.log(111111);
                // router.push("/error404");

            }
        })
        .then(({code, data, msg}) => {
            switch (code) {
                case 200:
                    //  return data;
                    return {code, data, msg};
                case 401:
                    router.push("/login");
                default:
                    console.log(222222);
                    throw new Error(msg);
            }
        }).catch(e => {
            console.log(333333);
            //router.push("/error404");
            return Promise.reject(e);
            //return Promise.reject(e.message);
        });
}