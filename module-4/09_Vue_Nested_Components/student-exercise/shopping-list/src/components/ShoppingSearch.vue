<template>
    <div class="search">
        <input type="text" id="search" name="search" v-on:keyup="filterData" placeholder="Search Shopping List..."/>
    </div>
</template>

<script>
export default {
    methods: {
        filterData() {
            const query = document.getElementById('search').value;
            this.$emit('filter-data', query);
        }
    },
    computed: {
        filteredData() {
            const filter = new RegExp(this.search,'i');
            return this.data.filter(item => item.name.match(filter));
        }
    }
}
</script>

<style>
#search {
    width:100%;
    font-size:24px;
    font-family: 'Roboto Condensed', sans-serif;
    padding:10px;
}
</style>