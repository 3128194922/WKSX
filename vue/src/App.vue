<script setup>
import {ref} from 'vue'
const text =ref("YY")

function change()
{
  text.value="XX";
}
</script>

<template>
  <div>{{text}}</div>
  <button type="button" @click="change()"></button>
</template>

<style scoped>
</style>
