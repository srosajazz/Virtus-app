import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ScreensearchComponent } from './screensearch.component';

describe('ScreensearchComponent', () => {
  let component: ScreensearchComponent;
  let fixture: ComponentFixture<ScreensearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ScreensearchComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ScreensearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
