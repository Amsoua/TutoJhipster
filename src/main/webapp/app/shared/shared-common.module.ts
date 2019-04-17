import { NgModule } from '@angular/core';

import { TutoJHipsterSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [TutoJHipsterSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [TutoJHipsterSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class TutoJHipsterSharedCommonModule {}
