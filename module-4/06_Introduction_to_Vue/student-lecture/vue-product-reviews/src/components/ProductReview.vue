<template>
    <div class="main">
        <h2>Product Reviews for {{ name }}</h2>
        <p class="description">{{ description }}</p>
    </div>
    
</template>

<script>


export default {
    // name: "product-review"
    data() {
        return {
            name: 'Tribes',
            description: 'An awesome book about being a part of a group.'
        };
    }
};
</script>

<style scoped>
.main {
    margin: 1rem 0;
}
</style>
