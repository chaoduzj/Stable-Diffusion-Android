package com.shifthackz.aisdv1.presentation.screen.settings

/*
    getStableDiffusionModelsUseCase: GetStableDiffusionModelsUseCase,
    private val selectStableDiffusionModelUseCase: SelectStableDiffusionModelUseCase,
 */

/*
    init {
        getStableDiffusionModelsUseCase()
            .subscribeOnMainThread(schedulersProvider)
            .subscribeBy(
                onError = { t ->
                    t.printStackTrace()
                },
                onSuccess = { data ->
                    setState(
                        TextToImageState.Content(
                            models = data.map { (model, _) -> model.title },
                            selectedModel = UiText.Static(
                                data.firstOrNull { it.second }?.first?.title ?: "",
                            ),
                        )
                    )
                },
            )
            .addToDisposable()
    }
 */

/*
fun selectStableDiffusionModel(value: String) = (currentState as? TextToImageState.Content)
        ?.copy(selectedModel = value.asUiText())
        ?.also(::setState)
        ?.let(TextToImageState.Content::selectedModel)
        ?.let(UiText::toString)
        ?.let(selectStableDiffusionModelUseCase::invoke)
        ?.subscribeOnMainThread(schedulersProvider)
        ?.subscribeBy(
            onError = {

            },
            onComplete = {

            },
        )
        ?.addToDisposable()
 */