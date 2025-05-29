<template>

  <div class="mb-4">
    <el-button type="primary" @click="handlerAdd">新增</el-button>
  </div>
  <el-table :data="tableData" style="width: 100%">
    <el-table-column fixed prop="id" label="编号" width="150" />
    <el-table-column prop="username" label="用户名" width="120" />
    <el-table-column prop="nickname" label="名称" width="120" />
    <el-table-column prop="phone" label="电话" width="120" />
    <el-table-column prop="gender" label="性别" width="600" />
    <el-table-column fixed="right" label="Operations" min-width="120">
      <template #default="scope">
        <el-button link type="warning" size="small" @click="handleClick">
          编辑
        </el-button>
        <el-button link type="warning" size="small" @click="submitDel(scope.row.id)">删除</el-button>
      </template>
    </el-table-column>
  </el-table>

  <!--新增数据窗口-->
  <el-dialog
      v-model="dialogVisible"
      title="新增数据"
      width="500"

  >

    <el-form :model="addData" label-width="auto" style="max-width: 600px">
      <el-form-item label="用户账号">
        <el-input v-model="addData.username" />
      </el-form-item>
      <el-form-item label="电话">
        <el-input v-model="addData.phone" />
      </el-form-item>
      <el-form-item label="性别">
        <el-radio-group v-model="addData.gender">
          <el-radio value="男">男</el-radio>
          <el-radio value="女">女</el-radio>
        </el-radio-group>
      </el-form-item>
    </el-form>

    <template #footer>
      <div class="dialog-footer">
        <el-button @click="dialogVisible = false">取消</el-button>
        <el-button type="primary" @click="submitAdd">
          提交
        </el-button>
      </div>
    </template>
  </el-dialog>
</template>

<script lang="ts" setup>
import {ref,onMounted} from 'vue'
import API from'./api/index'

/*绑定表格中数据*/
const tableData = ref([]);

onMounted(async function (){
  const result=await API.getUsers();
  /*将查询结果中的数据绑定到表格数据中*/
  tableData.value=result.data;
})

const addData=ref({
  username:'张三',
  phone:"",
  gender:'男',
})
//新增窗口是否可见
const dialogVisible =ref(false);
//点击新增按钮执行方法
const handlerAdd=function (){
  addData.value.username="";
  addData.value.phone="";
  addData.value.gender='男';
  dialogVisible.value = true;
}
/*提交新增数据*/
const  submitAdd=async ()=>{
  //将addData中的数据提交到后台服务
  const result=await API.addUsers(addData.value);
  //处理返回结果  将新增的数据添加到表格中
  tableData.value.unshift(result.data);
  //关闭对话框
  dialogVisible.value = false;
}
const submitDel=async (id :number)=>{
  //将addData中的数据提交到后台服务
  const result=await API.delUsers(id);
  //处理返回结果  将新增的数据添加到表格中
  tableData.value=tableData.value.filter(user=>user.id!==id);
}

const handleClick = () => {
  console.log('click')
}


</script>
<style scoped>

</style>
