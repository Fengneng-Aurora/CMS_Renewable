onEvent('recipes', event => {
    //潜影纤维
    event.recipes.createCrushing(['3x kubejs:shulker_fibre',
            Item.of('kubejs:shulker_fibre').withChance(0.5)],
        'minecraft:shulker_shell'
    )

    //鞘翅胚
    event.recipes.createMechanicalCrafting('kubejs:elytra_embryo', [
        ' II ',
        'I  I'
    ], {
        I: 'minecraft:phantom_membrane',
    })

    //未激发态鞘翅
    event.recipes.createSequencedAssembly('kubejs:inactive_elytra', 'kubejs:elytra_embryo', [
        event.recipes.createDeploying('kubejs:incomplete_inactive_elytra', ['kubejs:incomplete_inactive_elytra', 'kubejs:shulker_fibre']),
    ]).transitionalItem('kubejs:incomplete_inactive_elytra').loops(64)

    //鞘翅
    event.recipes.createSequencedAssembly('minecraft:elytra', 'kubejs:inactive_elytra', [
        event.recipes.createFilling('kubejs:incomplete_elytra', ['kubejs:incomplete_elytra', Fluid.of("create:potion", 250, {Potion: 'minecraft:long_slow_falling'})]),
        event.recipes.createPressing('kubejs:incomplete_elytra', 'kubejs:incomplete_elytra').heated(),
    ]).transitionalItem('kubejs:incomplete_elytra').loops(8)

    //粗制残骸
    event.blasting('kubejs:rough_debris', 'minecraft:netherite_scrap')

    //超塑性残骸
    event.recipes.createMixing(['kubejs:superplastic_debris', '4x minecraft:netherrack'], [
        '8x minecraft:bone_block',
        Fluid.of("minecraft:lava", 1000),
        'kubejs:rough_debris'
    ]).superheated()

    //远古残骸与远古残渣
    event.recipes.createSplashing([
        'minecraft:ancient_debris',
        Item.of('kubejs:ancient_residue').withChance(0.12)
    ], 'kubejs:superplastic_debris')

    //下界合金碎片
    event.recipes.createSequencedAssembly([Item.of('minecraft:netherite_scrap').withChance(0.64), Item.of('create:cinder_flour').withChance(0.36)], 'kubejs:ancient_residue', [
        event.recipes.createDeploying('kubejs:incomplete_netherite_scrap', ['kubejs:incomplete_netherite_scrap', 'kubejs:ancient_residue']),
        event.recipes.createPressing(['kubejs:incomplete_netherite_scrap', Item.of('create:cinder_flour').withChance(0.03)], 'kubejs:incomplete_netherite_scrap'),
        event.recipes.createCutting('kubejs:incomplete_netherite_scrap', 'kubejs:incomplete_netherite_scrap').processingTime(1536)
    ]).transitionalItem('kubejs:incomplete_netherite_scrap').loops(16)

    //方解石
    event.recipes.createCompacting('minecraft:calcite', [
        '2x minecraft:bone_meal',
        Fluid.of("minecraft:lava", 100),
        'create:limestone'
    ])

    //海绵
    event.recipes.createMixing('minecraft:wet_sponge', [
        Fluid.of('minecraft:water', 1000),
        'minecraft:moss_block',
        'minecraft:yellow_dye'
    ])

    //锌再生
    onEvent('entity.loot_tables', event => {
        event.modifyEntity('minecraft:stray', table => {
            table.addPool(pool => {
                pool.addItem('create:zinc_nugget', 1, [1, 3])
            })
        })
    })
})