<template>
    <div class="search">
        <input type="text" id="search" name="search" v-on:keyup="filterTasks" placeholder="Search Todo's..."/>
    </div>
</template>

<script>
export default {
    methods: {
        filterTasks() {
            const query = document.getElementById('search').value;
            this.$emit('filter-tasks', query);
        }
    },
    computed: {
        filteredTasks() {
            const filter = new RegExp(this.search,'i');
            return this.todos.filter(todo => todo.task.match(filter));
        }
    }
}
</script>

<style>
#search {
    width:100%;
    font-size:24px;
    font-family: 'Roboto Condensed', sans-serif;
    margin-top:50px;
    padding:10px;
}
</style>
