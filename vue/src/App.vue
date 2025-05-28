<script setup>
import {ref} from 'vue'
const easyhtml=ref("java so easy");

const msg=ref("vue页面");

const htmltext=ref("<span style='color:red'>你好</span>");

const boxstyle=ref("width:100px;height:100px;background-color:green;");

const isok=ref(true);

function change(){
  easyhtml.value="好好学习，天天向上";
  msg.value="软工3班实训";
  boxstyle.value="width:100px;height:100px;background-color:pink;border-radius:50px";
  isok.value=false;
}
</script>

<template>
  <div v-html="easyhtml"></div>

  <p>{{ msg }}</p>

  <div v-text="htmltext"></div>

  <div v-html="htmltext"></div>

  <div v-bind:style="boxstyle"></div>

  <button :disabled="isok">OK按钮</button>

  <button type="button" @click="change()">按钮</button>

</template>

<style scoped>

</style>
