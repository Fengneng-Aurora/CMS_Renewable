// priority: 0
onEvent('item.registry', event => {
    event.create('incomplete_elytra', 'create:sequenced_assembly')
    event.create('incomplete_netherite_scrap', 'create:sequenced_assembly')
    event.create('incomplete_inactive_elytra', 'create:sequenced_assembly')
    event.create('inactive_elytra')
    event.create('rough_debris')
    event.create('shulker_fibre')
    event.create('elytra_embryo')
    event.create('superplastic_debris')
    event.create('ancient_residue')
})