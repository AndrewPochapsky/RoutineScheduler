package com.company.loaf.routinescheduler.change;

public interface ChangeView {

    void showFieldError();
    void hideFieldError();

    void showDuplicateNameError();

    void showProgress();
    void hideProgress();

    void showSaveError();

    void showSuccess(String name);

    void onBack();

    void changeRoutine();
}
