<template>
  <table>
    <tr>
      <td>id</td>
      <td>书名</td>
      <td>作者</td>
    </tr>
    <tr :key="book.id" v-for="book in books">
      <td>{{ book.id }}</td>
      <td>{{ book.name }}</td>
      <td>{{ book.author }}</td>
    </tr>
  </table>
</template>

<script>
export default {
  name: "Book",
  data() {
    return {
      books: [
        {
          id: 1,
          name: '书1212',
          author: '作者1'
        },
        {
          id: 2,
          name: '书2322',
          author: '作者2'
        },
        {
          id: 3,
          name: '书3444',
          author: '作者3'
        }
      ]
    }
  },
  created() { // 加载前执行，先加载数据
    const _this = this
    axios.get("http://localhost:8888/book/findAll").then(resp=>{
      console.log(resp)
      _this.books = resp.data
    })
  }
}
</script>

<style scoped>

</style>